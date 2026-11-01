package in;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: UpnpInputArgument.java */
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface e {
    String[] aliases() default {};

    String name();

    String stateVariable() default "";
}
