package rf;

import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.Ad;

/* JADX INFO: compiled from: DisplayAdObjectParams.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends h {
    public a(@NonNull Ad ad2) {
        super(ad2);
        prepareEvents(ad2.getDisplay().getEventList());
    }

    public void setHeight(int i10) {
        getData().put("height", Integer.valueOf(i10));
    }

    public void setWidth(int i10) {
        getData().put("width", Integer.valueOf(i10));
    }
}
