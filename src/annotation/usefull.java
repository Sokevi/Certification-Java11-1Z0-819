package annotation;

public @interface usefull {
    int[] value();
    String description() default "usefull";
    String[] test();

}
