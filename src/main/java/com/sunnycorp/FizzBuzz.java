package com.sunnycorp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Created by spatneedi on 9/22/16.
 */
public class FizzBuzz {
    private int intRangeStart = 1;
    private int intRangeEnd = 100;
    private List<String> stringList = new ArrayList<>();

    public FizzBuzz() {
        //Build String List for a specific range
        IntStream.range(intRangeStart,intRangeEnd+1)
                .forEach(val -> stringList.add(String.valueOf(val)));
        //Manipulate the List based on the specification criteria
        stringList.stream()
                    .forEach(l -> {
                        //If multiple of 3, set to Fizz
                        if(Integer.parseInt(l) % 3 == 0){
                            stringList.set(Integer.parseInt(l)-1, "Fizz");
                        }
                        //If multiple of 5, set to Buzz
                        else if(Integer.parseInt(l) % 5 == 0){
                            stringList.set(Integer.parseInt(l)-1, "Buzz");
                        }
                        //If multiple of 15, set to FizzBuzz
                        if(Integer.parseInt(l) % 15 == 0){
                            stringList.set(Integer.parseInt(l)-1, "FizzBuzz");
                        };
                    });
    }

    public List<String> getFizzBuzzArray(){
        return stringList;
    }

    public Optional<String> getFizzBuzzArrayValue(int index){
        if(index < Integer.parseInt(stringList.get(0)) || index > stringList.size()){
            return Optional.empty();
        }
        return Optional.of(stringList.get(index-1));
    }
}
