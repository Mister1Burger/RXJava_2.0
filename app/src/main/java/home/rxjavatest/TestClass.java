package home.rxjavatest;


import android.util.ArrayMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


import io.reactivex.Observable;
import io.reactivex.ObservableSource;

public class TestClass {


    public Observable<Map<Integer,String>> getNumbers()  {

        Map<Integer, String> numberList = new TreeMap<>();

        return Observable.just(numberList)
                .doOnNext(numbers -> numbers.put(0,"null"))
                .doOnNext(numbers -> numbers.put(5,"five"))
                .doOnNext(numbers -> numbers.put(3,"three"))
                .doOnNext(numbers -> numbers.put(2,"two"))
                .doOnNext(numbers -> numbers.put(4,"four"))
                .doOnNext(numbers -> numbers.put(1,"one"));

    }


}
