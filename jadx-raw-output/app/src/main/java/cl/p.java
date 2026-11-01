package cl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: JsonAnnotations.kt */
/* JADX INFO: loaded from: classes2.dex */
@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface p {
    String[] names();
}
