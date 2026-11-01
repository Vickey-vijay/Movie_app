package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import mj.r;
import rj.c;

/* JADX INFO: compiled from: FetchSignalsAndSendUseCase.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface FetchSignalsAndSendUseCase {
    Object invoke(int i10, ByteString byteString, TokenConfiguration tokenConfiguration, c<? super r> cVar);
}
