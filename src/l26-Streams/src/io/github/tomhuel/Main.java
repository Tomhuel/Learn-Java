package io.github.tomhuel;

import io.github.tomhuel.APIStream.StreamAnyMatch.StreamAnyMatch;
import io.github.tomhuel.APIStream.StreamAnyMatch.StreamCount;
import io.github.tomhuel.APIStream.StreamFilter.StreamFilter;
import io.github.tomhuel.APIStream.StreamFilter.StreamSingleFilter;

public class Main {
    public static void main(String[] args) {
//        CreateStream.execute();
//        StreamMap.execute();
//        StreamFilter.execute();
//        StreamSingleFilter.execute();
        StreamAnyMatch.execute();
        StreamCount.execute();
    }
}