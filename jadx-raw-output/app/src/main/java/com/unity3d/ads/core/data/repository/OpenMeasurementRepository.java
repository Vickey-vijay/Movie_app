package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import rj.c;

/* JADX INFO: compiled from: OpenMeasurementRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, c<? super OMResult> cVar);

    Object finishSession(ByteString byteString, c<? super OMResult> cVar);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z10, c<? super OMResult> cVar);

    boolean isOMActive();

    void setOMActive(boolean z10);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, c<? super OMResult> cVar);
}
