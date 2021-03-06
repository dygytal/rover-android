package io.rover.util;

/**
 * Created by chrisrecalis on 2016-11-01.
 */
public class Optional<T> {

    T mValue = null;
    boolean mValueSet = false;

    public void set(T value) {
        mValue = value;
        mValueSet = true;
    }

    public Boolean hasBeenSet() {
        return mValueSet;
    }

    public T getOrElse(T defaultValue) {
        if (hasBeenSet()) {
            return mValue;
        } else {
            return defaultValue;
        }
    }

    public T get() {
        return mValue;
    }

    public void clear() {
        mValue = null;
        mValueSet = false;
    }

}