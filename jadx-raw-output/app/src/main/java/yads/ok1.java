package yads;

import java.util.List;
import yads.wk1;

/* JADX INFO: loaded from: classes9.dex */
public interface ok1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ok1 f81065a = new ok1() { // from class: cp.w7
        @Override // yads.ok1
        public final List getDecoderInfos(String str, boolean z10, boolean z11) {
            return wk1.a(str, z10, z11);
        }
    };

    List getDecoderInfos(String str, boolean z10, boolean z11);
}
