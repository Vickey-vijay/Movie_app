package com.yandex.div.core.view2;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import bk.l;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import mj.r;

/* JADX INFO: compiled from: DivPlaceholderLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
public class DivPlaceholderLoader {
    private final ExecutorService executorService;
    private final Div2ImageStubProvider imageStubProvider;

    private Future<?> decodeBase64(String str, boolean z10, l<? super ImageRepresentation, r> lVar) {
        DecodeBase64ImageTask decodeBase64ImageTask = new DecodeBase64ImageTask(str, z10, lVar);
        if (!z10) {
            return this.executorService.submit(decodeBase64ImageTask);
        }
        decodeBase64ImageTask.run();
        return null;
    }

    @MainThread
    public void applyPlaceholder(LoadableImage loadableImage, final ErrorCollector errorCollector, String str, final int i10, boolean z10, final l<? super Drawable, r> lVar, final l<? super ImageRepresentation, r> lVar2) {
        r rVar;
        if (str != null) {
            enqueueDecoding(str, loadableImage, z10, new l<ImageRepresentation, r>() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$applyPlaceholder$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(ImageRepresentation imageRepresentation) {
                    invoke2(imageRepresentation);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ImageRepresentation imageRepresentation) {
                    if (imageRepresentation != null) {
                        lVar2.invoke(imageRepresentation);
                    } else {
                        errorCollector.logWarning(new Throwable("Preview doesn't contain base64 image"));
                        lVar.invoke(this.imageStubProvider.getImageStubDrawable(i10));
                    }
                }
            });
            rVar = r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            lVar.invoke(this.imageStubProvider.getImageStubDrawable(i10));
        }
    }

    public DivPlaceholderLoader(Div2ImageStubProvider div2ImageStubProvider, ExecutorService executorService) {
        this.imageStubProvider = div2ImageStubProvider;
        this.executorService = executorService;
    }

    private void enqueueDecoding(String str, final LoadableImage loadableImage, boolean z10, final l<? super ImageRepresentation, r> lVar) {
        Future<?> loadingTask = loadableImage.getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        Future<?> futureDecodeBase64 = decodeBase64(str, z10, new l<ImageRepresentation, r>() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$enqueueDecoding$future$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ImageRepresentation imageRepresentation) {
                lVar.invoke(imageRepresentation);
                loadableImage.cleanLoadingTask();
            }
        });
        if (futureDecodeBase64 != null) {
            loadableImage.saveLoadingTask(futureDecodeBase64);
        }
    }
}
