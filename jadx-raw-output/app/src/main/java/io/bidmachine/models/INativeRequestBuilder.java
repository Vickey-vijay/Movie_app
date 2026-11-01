package io.bidmachine.models;

import androidx.annotation.NonNull;
import io.bidmachine.MediaAssetType;
import io.bidmachine.models.INativeRequestBuilder;

/* JADX INFO: loaded from: classes11.dex */
public interface INativeRequestBuilder<SelfType extends INativeRequestBuilder> {
    SelfType setMediaAssetTypes(@NonNull MediaAssetType... mediaAssetTypeArr);
}
