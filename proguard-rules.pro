-keepattributes Signature,Exceptions,InnerClasses,EnclosingMethod,*Annotation*

-keep public interface droidkit.** { *; }

-keep public class droidkit.** {
    public static <fields>;
    public static <methods>;
    public <methods>;
    protected <methods>;
}

-keep @android.support.annotation.Keep class droidkit.**
-keepclassmembers class droidkit.** {
    @android.support.annotation.Keep *;
}

-dontwarn javax.**
-dontwarn com.squareup.**
