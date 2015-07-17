-- The function get_name() should return a single string that is the name of the puzzle.
--
function get_name()
	return "SEQUENCE PEAK DETECTOR"
end

-- The function get_description() should return an array of strings, where each string is
-- a line of description for the puzzle. The text you return from get_description() will 
-- be automatically formatted and wrapped to fit inside the puzzle information box.
--
function get_description()
	return { "SEQUENCES ARE ZERO-TERMINATED",
		"READ A SEQUENCE FROM IN",
		"WRITE THE MIN VALUE TO OUT.I",
		"WRITE THE MAX VALUE TO OUT.A" }
end

-- The function get_streams() should return an array of streams. Each stream is described
-- by an array with exactly four values: a STREAM_* value, a name, a position, and an array
-- of integer values between -999 and 999 inclusive.
--
-- STREAM_INPUT: An input stream containing up to 39 numerical values.
-- STREAM_OUTPUT: An output stream containing up to 39 numerical values.
-- STREAM_IMAGE: An image output stream, containing exactly 30*18 numerical values between 0
--               and 4, representing the full set of "pixels" for the target image.
--
-- NOTE: Arrays in Lua are implemented as tables (dictionaries) with integer keys that start
--       at 1 by convention. The sample code below creates an input array of 39 random values
--       and an output array that doubles all of the input values.
--
-- NOTE: To generate random values you should use math.random(). However, you SHOULD NOT seed
--       the random number generator with a new seed value, as that is how TIS-100 ensures that
--       the first test run is consistent for all users, and thus something that allows for the
--       comparison of cycle scores.
--
-- NOTE: Position values for streams should be between 0 and 3, which correspond to the far
--       left and far right of the TIS-100 segment grid. Input streams will be automatically
--       placed on the top, while output and image streams will be placed on the bottom.
--
function get_streams()
	local input = {}
	local mins = {}
	local maxs = {}
	local n = 1
	local mn = 1
	while n<39 do
		local howMany = math.random(1, 5);
        if (n + howMany + 1 > 39) then
            howMany = 39 - n - 1
        end
		local min = 999;
		local max = -999;
		for i = 0,howMany-1 do
			input[n + i] = math.random(1, 999)
			min = math.min(min, input[n + i])
			max = math.max(max, input[n + i])
		end
		input[n + howMany] = 0
		n = n + howMany + 1
		mins[mn] = min
		maxs[mn] = max
		mn = mn + 1
	end


	return {
		{ STREAM_INPUT, "IN", 1, input },
		{ STREAM_OUTPUT, "OUT.I", 1, mins },
		{ STREAM_OUTPUT, "OUT.A", 2, maxs },
	}
end

-- The function get_layout() should return an array of exactly 12 TILE_* values, which
-- describe the layout and type of tiles found in the puzzle.
--
-- TILE_COMPUTE: A basic execution node (node type T21).
-- TILE_MEMORY: A stack memory node (node type T30).
-- TILE_DAMAGED: A damaged execution node, which acts as an obstacle.
--
function get_layout()
	return {
		TILE_COMPUTE, 	TILE_COMPUTE, 	TILE_COMPUTE, 	TILE_COMPUTE,
		TILE_COMPUTE, 	TILE_COMPUTE,	TILE_COMPUTE, 	TILE_DAMAGED,
		TILE_COMPUTE, 	TILE_COMPUTE,	TILE_COMPUTE, 	TILE_COMPUTE,
	}
end
