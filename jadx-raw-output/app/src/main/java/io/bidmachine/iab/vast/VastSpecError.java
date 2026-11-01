package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.safedk.android.internal.d;

/* JADX INFO: loaded from: classes2.dex */
public class VastSpecError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f59490a;

    @NonNull
    public static final VastSpecError XML_PARSING = new VastSpecError(100);

    @NonNull
    public static final VastSpecError XML_VALIDATE = new VastSpecError(101);

    @NonNull
    public static final VastSpecError DURATION = new VastSpecError(202);

    @NonNull
    public static final VastSpecError GENERAL_WRAPPER = new VastSpecError(d.f44769a);

    @NonNull
    public static final VastSpecError BAD_URI = new VastSpecError(301);

    @NonNull
    public static final VastSpecError EXCEEDED_WRAPPER_LIMIT = new VastSpecError(302);

    @NonNull
    public static final VastSpecError WRAPPER_RESPONSE_NO_AD = new VastSpecError(303);

    @NonNull
    public static final VastSpecError GENERAL_LINEAR = new VastSpecError(400);

    @NonNull
    public static final VastSpecError NO_FILE = new VastSpecError(401);

    @NonNull
    public static final VastSpecError BAD_FILE = new VastSpecError(403);

    @NonNull
    public static final VastSpecError SHOWING = new VastSpecError(405);

    @NonNull
    public static final VastSpecError GENERAL_COMPANION = new VastSpecError(600);

    @NonNull
    public static final VastSpecError UNKNOWN = new VastSpecError(TypedValues.Custom.TYPE_INT);

    private VastSpecError(int i10) {
        this.f59490a = i10;
    }

    public int getCode() {
        return this.f59490a;
    }

    @NonNull
    public String toString() {
        return String.format("%s", Integer.valueOf(this.f59490a));
    }
}
