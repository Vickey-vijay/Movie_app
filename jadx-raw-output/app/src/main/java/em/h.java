package em;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

/* JADX INFO: compiled from: LoggingListener.java */
/* JADX INFO: loaded from: classes11.dex */
public class h<R> implements RequestListener<R> {
    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable GlideException glideException, Object obj, Target<R> target, boolean z10) {
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(R r10, Object obj, Target<R> target, DataSource dataSource, boolean z10) {
        return false;
    }
}
