package in;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: UpnpServiceType.java */
/* JADX INFO: loaded from: classes6.dex */
@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface i {
    String namespace() default "schemas-upnp-org";

    String value();

    int version() default 1;
}
