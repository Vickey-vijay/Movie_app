package com.yandex.div.core;

import android.graphics.drawable.PictureDrawable;
import ck.i;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import com.yandex.div2.DivVideoSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: DivPreloader.kt */
/* JADX INFO: loaded from: classes5.dex */
public class DivPreloader {
    public static final Companion Companion = new Companion(null);
    private static final Callback NO_CALLBACK = new Callback() { // from class: od.e
        @Override // com.yandex.div.core.DivPreloader.Callback
        public final void finish(boolean z10) {
            DivPreloader.NO_CALLBACK$lambda$0(z10);
        }
    };
    private final DivCustomContainerViewAdapter customContainerViewAdapter;
    private final DivExtensionController extensionController;
    private final DivImagePreloader imagePreloader;
    private final PreloadFilter preloadFilter;
    private final DivPlayerPreloader videoPreloader;

    /* JADX INFO: compiled from: DivPreloader.kt */
    public interface Callback {
        void finish(boolean z10);
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public static final class DownloadCallback extends DivImageDownloadCallback {
        private final Callback callback;
        private int downloadsLeftCount;
        private int failures;
        private boolean started;

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(CachedBitmap cachedBitmap) {
            done();
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(PictureDrawable pictureDrawable) {
            done();
        }

        public DownloadCallback(Callback callback) {
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void done() {
            boolean z10;
            if (UiThreadHandler.isMainThread()) {
                this.downloadsLeftCount--;
                if (this.downloadsLeftCount == 0 && this.started) {
                    Callback callback = this.callback;
                    if (this.failures != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    callback.finish(z10);
                    return;
                }
                return;
            }
            UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$done$$inlined$runOnUiThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.downloadsLeftCount--;
                    if (this.this$0.downloadsLeftCount == 0 && this.this$0.started) {
                        this.this$0.callback.finish(this.this$0.failures != 0);
                    }
                }
            });
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onError() {
            if (UiThreadHandler.isMainThread()) {
                this.failures++;
                done();
            } else {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onError$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.failures++;
                        this.this$0.done();
                    }
                });
            }
        }

        public final void onFullPreloadStarted() {
            if (UiThreadHandler.isMainThread()) {
                boolean z10 = true;
                this.started = true;
                if (this.downloadsLeftCount == 0) {
                    Callback callback = this.callback;
                    if (this.failures == 0) {
                        z10 = false;
                    }
                    callback.finish(z10);
                    return;
                }
                return;
            }
            UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onFullPreloadStarted$$inlined$runOnUiThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.started = true;
                    if (this.this$0.downloadsLeftCount == 0) {
                        this.this$0.callback.finish(this.this$0.failures != 0);
                    }
                }
            });
        }

        public final void onSingleLoadingStarted() {
            if (UiThreadHandler.isMainThread()) {
                this.downloadsLeftCount++;
            } else {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onSingleLoadingStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.downloadsLeftCount++;
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public interface PreloadFilter {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final PreloadFilter ONLY_PRELOAD_REQUIRED_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$ONLY_PRELOAD_REQUIRED_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(DivBackground divBackground, ExpressionResolver expressionResolver) {
                if (divBackground instanceof DivBackground.b) {
                    return ((DivBackground.b) divBackground).c().f47591f.evaluate(expressionResolver).booleanValue();
                }
                return false;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(Div div, ExpressionResolver expressionResolver) {
                if (!(div instanceof Div.q)) {
                    if (div instanceof Div.r) {
                        return ((Div.r) div).c().A.evaluate(expressionResolver).booleanValue();
                    }
                    if (div instanceof Div.g) {
                        return ((Div.g) div).c().H.evaluate(expressionResolver).booleanValue();
                    }
                    if (div instanceof Div.e) {
                        return ((Div.e) div).c().E.evaluate(expressionResolver).booleanValue();
                    }
                    return false;
                }
                List<DivText.Image> list = ((Div.q) div).c().F;
                if (list == null || list.isEmpty()) {
                    return false;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((DivText.Image) it.next()).f49524e.evaluate(expressionResolver).booleanValue()) {
                        return true;
                    }
                }
                return false;
            }
        };
        public static final PreloadFilter PRELOAD_ALL_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$PRELOAD_ALL_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(DivBackground divBackground, ExpressionResolver expressionResolver) {
                return true;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(Div div, ExpressionResolver expressionResolver) {
                return true;
            }
        };

        /* JADX INFO: compiled from: DivPreloader.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        boolean shouldPreloadBackground(DivBackground divBackground, ExpressionResolver expressionResolver);

        boolean shouldPreloadContent(Div div, ExpressionResolver expressionResolver);
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public interface PreloadReference {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: DivPreloader.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final PreloadReference EMPTY = new PreloadReference() { // from class: od.f
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public final void cancel() {
                    DivPreloader.PreloadReference.Companion.EMPTY$lambda$0();
                }
            };

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EMPTY$lambda$0() {
            }

            public final PreloadReference getEMPTY() {
                return EMPTY;
            }
        }

        void cancel();
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public final class PreloadVisitor extends DivVisitor<r> {
        private final Callback callback;
        private final DownloadCallback downloadCallback;
        private final PreloadFilter preloadFilter;
        private final ExpressionResolver resolver;
        private final TicketImpl ticket = new TicketImpl();

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r defaultVisit(Div div, ExpressionResolver expressionResolver) {
            defaultVisit2(div, expressionResolver);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.b bVar, ExpressionResolver expressionResolver) {
            visit2(bVar, expressionResolver);
            return r.f64562a;
        }

        public PreloadVisitor(DownloadCallback downloadCallback, Callback callback, ExpressionResolver expressionResolver, PreloadFilter preloadFilter) {
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(Div div, ExpressionResolver expressionResolver) {
            List<LoadReference> listPreloadImage;
            DivImagePreloader divImagePreloader = DivPreloader.this.imagePreloader;
            if (divImagePreloader != null && (listPreloadImage = divImagePreloader.preloadImage(div, expressionResolver, this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = listPreloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivPreloader.this.extensionController.preprocessExtensions(div.b(), expressionResolver);
        }

        public final Ticket preload(Div div) {
            visit(div, this.resolver);
            return this.ticket;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.d dVar, ExpressionResolver expressionResolver) {
            visit2(dVar, expressionResolver);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.f fVar, ExpressionResolver expressionResolver) {
            visit2(fVar, expressionResolver);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.j jVar, ExpressionResolver expressionResolver) {
            visit2(jVar, expressionResolver);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.n nVar, ExpressionResolver expressionResolver) {
            visit2(nVar, expressionResolver);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.p pVar, ExpressionResolver expressionResolver) {
            visit2(pVar, expressionResolver);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.r rVar, ExpressionResolver expressionResolver) {
            visit2(rVar, expressionResolver);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.b bVar, ExpressionResolver expressionResolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(bVar.c(), expressionResolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((Div) bVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.f fVar, ExpressionResolver expressionResolver) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(fVar.c()).iterator();
            while (it.hasNext()) {
                visit((Div) it.next(), expressionResolver);
            }
            defaultVisit2((Div) fVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.d dVar, ExpressionResolver expressionResolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(dVar.c(), expressionResolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((Div) dVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.j jVar, ExpressionResolver expressionResolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(jVar.c(), expressionResolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((Div) jVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.p pVar, ExpressionResolver expressionResolver) {
            Iterator<T> it = pVar.c().f49264q.iterator();
            while (it.hasNext()) {
                visit(((DivTabs.Item) it.next()).f49276a, expressionResolver);
            }
            defaultVisit2((Div) pVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.n nVar, ExpressionResolver expressionResolver) {
            Iterator<T> it = nVar.c().I.iterator();
            while (it.hasNext()) {
                Div div = ((DivState.State) it.next()).f49049c;
                if (div != null) {
                    visit(div, expressionResolver);
                }
            }
            defaultVisit2((Div) nVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.c cVar, ExpressionResolver expressionResolver) {
            List<Div> list = cVar.c().f46881q;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    visit((Div) it.next(), expressionResolver);
                }
            }
            this.ticket.addReference(DivPreloader.this.customContainerViewAdapter.preload(cVar.c(), this.callback));
            defaultVisit2((Div) cVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.r rVar, ExpressionResolver expressionResolver) {
            defaultVisit2((Div) rVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(rVar, expressionResolver)) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = rVar.c().Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DivVideoSource) it.next()).f50038d.evaluate(expressionResolver));
                }
                this.ticket.addReference(DivPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public interface Ticket {
        void cancel();
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public static final class TicketImpl implements Ticket {
        private final List<PreloadReference> refs = new ArrayList();

        private final PreloadReference toPreloadReference(final LoadReference loadReference) {
            return new PreloadReference() { // from class: com.yandex.div.core.DivPreloader$TicketImpl$toPreloadReference$1
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public void cancel() {
                    loadReference.cancel();
                }
            };
        }

        public final void addImageReference(LoadReference loadReference) {
            this.refs.add(toPreloadReference(loadReference));
        }

        public final void addReference(PreloadReference preloadReference) {
            this.refs.add(preloadReference);
        }

        @Override // com.yandex.div.core.DivPreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.refs.iterator();
            while (it.hasNext()) {
                ((PreloadReference) it.next()).cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NO_CALLBACK$lambda$0(boolean z10) {
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Callback getNO_CALLBACK$div_release() {
            return DivPreloader.NO_CALLBACK;
        }
    }

    public Ticket preload(Div div, ExpressionResolver expressionResolver, Callback callback) {
        DownloadCallback downloadCallback = new DownloadCallback(callback);
        Ticket ticketPreload = new PreloadVisitor(downloadCallback, callback, expressionResolver, this.preloadFilter).preload(div);
        downloadCallback.onFullPreloadStarted();
        return ticketPreload;
    }

    public DivPreloader(DivImagePreloader divImagePreloader, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController, DivPlayerPreloader divPlayerPreloader, PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }
}
