package in;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: UpnpServiceId.java */
/* JADX INFO: loaded from: classes6.dex */
@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface h {
    String namespace() default "upnp-org";

    String value();
}
