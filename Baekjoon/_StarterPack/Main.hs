-- 콘솔 입력 및 솔루션으로 재구성 필요

-- Int Array
intArray :: Int -> IO [Int]
intArray 0 = return []
intArray x = do
    str <- getLine
    nextInt <- intArray (x - 1)
    let int = read str :: Int
    return (int:nextInt)

-- Main Function
main = do
    array <- intArray 5
    putStrLn (show array)
