package com.unity3d.services.core.domain;

import androidx.exifinterface.media.ExifInterface;
import ck.p;
import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.Result;

/* JADX INFO: compiled from: ResultExtensions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ResultExtensionsKt {
    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        p.p(3, ExifInterface.LONGITUDE_EAST);
        if (thM3461exceptionOrNullimpl instanceof Exception) {
            return (E) thM3461exceptionOrNullimpl;
        }
        return null;
    }

    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        p.p(3, ExifInterface.LONGITUDE_EAST);
        if (thM3461exceptionOrNullimpl instanceof Exception) {
            return (E) thM3461exceptionOrNullimpl;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }

    public static final InitializationException getInitializationExceptionOrNull(Object obj) {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        if (thM3461exceptionOrNullimpl instanceof InitializationException) {
            return (InitializationException) thM3461exceptionOrNullimpl;
        }
        return null;
    }

    public static final InitializationException getInitializationExceptionOrThrow(Object obj) {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        if (thM3461exceptionOrNullimpl instanceof InitializationException) {
            return (InitializationException) thM3461exceptionOrNullimpl;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
