package agoraTemple;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Version {

    int value() default 1;  // default
    String name() ;  //require
    public static final int creator = 1 ;

}

