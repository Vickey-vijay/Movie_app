package io.bidmachine.media3.common.util;

import androidx.annotation.RequiresOptIn;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@UnstableApi
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface UnstableApi {
}
