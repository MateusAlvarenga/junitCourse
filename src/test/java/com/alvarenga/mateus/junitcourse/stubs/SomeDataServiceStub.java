package com.alvarenga.mateus.junitcourse.stubs;

import com.alvarenga.mateus.junitcourse.business.SomeDataService;

public class SomeDataServiceStub implements SomeDataService {
    @Override
    public int[] getNumbers() {
        return new int[]{5,5,5};
    }
}