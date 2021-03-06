package Decorator;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class HoofdLetterDecorator extends TextDecorator {
    public HoofdLetterDecorator(StringFromFileComponent str){
        super(str);
    }

    @Override
    public String get(){
        return str.get().toUpperCase();
    }
}
