package android.view.contentcapture;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class ContentCaptureSession implements AutoCloseable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ AutofillId newAutofillId(@NonNull AutofillId autofillId, long j10);

    @NonNull
    public final native /* synthetic */ ViewStructure newViewStructure(@NonNull View view);

    @NonNull
    public final native /* synthetic */ ViewStructure newVirtualViewStructure(@NonNull AutofillId autofillId, long j10);

    public final native /* synthetic */ void notifyViewAppeared(@NonNull ViewStructure viewStructure);

    public final native /* synthetic */ void notifyViewTextChanged(@NonNull AutofillId autofillId, @Nullable CharSequence charSequence);

    public final native /* synthetic */ void notifyViewsAppeared(@NonNull List<ViewStructure> list);

    public final native /* synthetic */ void notifyViewsDisappeared(@NonNull AutofillId autofillId, @NonNull long[] jArr);
}
