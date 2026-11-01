package rf;

import android.graphics.Point;
import androidx.annotation.NonNull;
import io.bidmachine.ContextProvider;
import io.bidmachine.unified.UnifiedAdRequestParams;

/* JADX INFO: compiled from: ISizableDisplayPlacement.java */
/* JADX INFO: loaded from: classes11.dex */
public interface g<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    Point getSize(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype);
}
