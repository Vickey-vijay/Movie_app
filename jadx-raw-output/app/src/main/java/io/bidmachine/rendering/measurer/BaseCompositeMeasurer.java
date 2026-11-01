package io.bidmachine.rendering.measurer;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.measurer.Measurer;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.CountDownPostback;
import io.bidmachine.rendering.utils.Utils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class BaseCompositeMeasurer<MeasurerType extends Measurer<ViewType>, ViewType extends View> implements Measurer<ViewType> {

    @NonNull
    public final List<MeasurerType> measurerList;

    public BaseCompositeMeasurer(@NonNull List<MeasurerType> list) {
        this.measurerList = new CopyOnWriteArrayList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Handler handler, Runnable runnable) {
        this.measurerList.clear();
        handler.post(runnable);
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void destroy(@Nullable final Runnable runnable) {
        final Handler handlerCreateHandlerWithMyOrMainLooper = Utils.createHandlerWithMyOrMainLooper();
        CountDownPostback countDownPostback = runnable != null ? new CountDownPostback(this.measurerList.size(), new Runnable() { // from class: ci.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f6039b.a(handlerCreateHandlerWithMyOrMainLooper, runnable);
            }
        }) : null;
        Iterator<MeasurerType> it = this.measurerList.iterator();
        while (it.hasNext()) {
            it.next().destroy(countDownPostback);
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onClicked() {
        Iterator<MeasurerType> it = this.measurerList.iterator();
        while (it.hasNext()) {
            it.next().onClicked();
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onError(@NonNull Error error) {
        Iterator<MeasurerType> it = this.measurerList.iterator();
        while (it.hasNext()) {
            it.next().onError(error);
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onShown() {
        Iterator<MeasurerType> it = this.measurerList.iterator();
        while (it.hasNext()) {
            it.next().onShown();
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewAddedToContainer(@NonNull ViewType viewtype, @NonNull ViewGroup viewGroup) {
        Iterator<MeasurerType> it = this.measurerList.iterator();
        while (it.hasNext()) {
            it.next().onViewAddedToContainer(viewtype, viewGroup);
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onViewCreated(@NonNull ViewType viewtype) {
        Iterator<MeasurerType> it = this.measurerList.iterator();
        while (it.hasNext()) {
            it.next().onViewCreated(viewtype);
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewReady(@NonNull ViewType viewtype) {
        Iterator<MeasurerType> it = this.measurerList.iterator();
        while (it.hasNext()) {
            it.next().onViewReady(viewtype);
        }
    }
}
