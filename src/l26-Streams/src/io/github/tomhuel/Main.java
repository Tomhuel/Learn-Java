package io.github.tomhuel;

import io.github.tomhuel.APIStream.InfiniteStream.InfiniteStream;
import io.github.tomhuel.APIStream.ListToStream.ListToStream;
import io.github.tomhuel.APIStream.StreamAnyMatch.StreamAnyMatch;
import io.github.tomhuel.APIStream.StreamAnyMatch.StreamCount;
import io.github.tomhuel.APIStream.StreamFilter.StreamFilter;
import io.github.tomhuel.APIStream.StreamFilter.StreamSingleFilter;
import io.github.tomhuel.APIStream.StreamFlatMap.StreamFlatMap;
import io.github.tomhuel.APIStream.StreamOperators.*;

public class Main {
    public static void main(String[] args) {
//        CreateStream.execute();

//        StreamMap.execute();

//        StreamFilter.execute();
//        StreamSingleFilter.execute();

//        StreamAnyMatch.execute();
//        StreamCount.execute();

//        StreamFilterEmpty.execute();
//        StreamDistinct.execute();
//        StreamReduce.execute();
//        StreamRange.execute();

//        StreamDistinctUser.execute();

//        StreamFlatMap.execute();
//        ListToStream.execute();

        InfiniteStream.execute();
    }
}