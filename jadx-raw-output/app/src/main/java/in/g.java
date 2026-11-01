package in;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: UpnpService.java */
/* JADX INFO: loaded from: classes6.dex */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface g {
    h serviceId();

    i serviceType();

    Class[] stringConvertibleTypes() default {};

    boolean supportsQueryStateVariables() default true;
}
