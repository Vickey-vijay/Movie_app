package la;

import androidx.annotation.DrawableRes;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import java.util.List;

/* JADX INFO: compiled from: CollectionContract.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface b {
    void delete();

    void refresh(int i10);

    void setEdits(@DrawableRes int i10);

    void showData(List<VideoCollectionBeanEntry> list);

    void video(String str, int i10);

    void whole(String str);
}
