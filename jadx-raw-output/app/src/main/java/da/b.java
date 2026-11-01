package da;

import com.mgs.carparking.netbean.RecommandVideosEntity;
import java.util.List;

/* JADX INFO: compiled from: VideoMoreContract.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface b {
    void isLoading(boolean z10);

    void loadNoNet(boolean z10);

    void onClick(RecommandVideosEntity recommandVideosEntity);

    void resetNoMoreData();

    void showData(List<RecommandVideosEntity> list);
}
