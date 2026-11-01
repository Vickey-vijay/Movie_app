package com.yandex.div.core;

import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div2.Div;
import com.yandex.div2.DivVideoSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: DivViewDataPreloader.kt */
/* JADX INFO: loaded from: classes7.dex */
public class DivViewDataPreloader {
    private final DivCustomContainerViewAdapter customContainerViewAdapter;
    private final DivExtensionController extensionController;
    private final DivImagePreloader imagePreloader;
    private final DivPreloader.PreloadFilter preloadFilter;
    private final DivPlayerPreloader videoPreloader;

    /* JADX INFO: compiled from: DivViewDataPreloader.kt */
    public final class PreloadVisitor extends DivTreeVisitor<r> {
        private final DivPreloader.Callback callback;
        private final DivPreloader.DownloadCallback downloadCallback;
        private final DivPreloader.PreloadFilter preloadFilter;
        private final DivPreloader.TicketImpl ticket;

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ r defaultVisit(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(div, bindingContext, divStatePath);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ r visit(Div.c cVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(cVar, bindingContext, divStatePath);
            return r.f64562a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PreloadVisitor(DivPreloader.DownloadCallback downloadCallback, DivPreloader.Callback callback, DivPreloader.PreloadFilter preloadFilter) {
            super(null, 1, 0 == true ? 1 : 0);
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.preloadFilter = preloadFilter;
            this.ticket = new DivPreloader.TicketImpl();
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
            List<LoadReference> listPreloadImage;
            DivImagePreloader divImagePreloader = DivViewDataPreloader.this.imagePreloader;
            if (divImagePreloader != null && (listPreloadImage = divImagePreloader.preloadImage(div, bindingContext.getExpressionResolver(), this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = listPreloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivViewDataPreloader.this.extensionController.preprocessExtensions(div.b(), bindingContext.getExpressionResolver());
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ r visit(Div.r rVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(rVar, bindingContext, divStatePath);
            return r.f64562a;
        }

        public final DivPreloader.Ticket preload(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
            visit(div, bindingContext, divStatePath);
            return this.ticket;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.c cVar, BindingContext bindingContext, DivStatePath divStatePath) {
            super.visit(cVar, bindingContext, divStatePath);
            this.ticket.addReference(DivViewDataPreloader.this.customContainerViewAdapter.preload(cVar.c(), this.callback));
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.r rVar, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2((Div) rVar, bindingContext, divStatePath);
            if (this.preloadFilter.shouldPreloadContent(rVar, bindingContext.getExpressionResolver())) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = rVar.c().Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DivVideoSource) it.next()).f50038d.evaluate(bindingContext.getExpressionResolver()));
                }
                this.ticket.addReference(DivViewDataPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    public static /* synthetic */ DivPreloader.Ticket preload$default(DivViewDataPreloader divViewDataPreloader, Div div, BindingContext bindingContext, DivStatePath divStatePath, DivPreloader.Callback callback, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        if ((i10 & 8) != 0) {
            callback = DivPreloader.Companion.getNO_CALLBACK$div_release();
        }
        return divViewDataPreloader.preload(div, bindingContext, divStatePath, callback);
    }

    public DivPreloader.Ticket preload(Div div, BindingContext bindingContext, DivStatePath divStatePath, DivPreloader.Callback callback) {
        DivPreloader.DownloadCallback downloadCallback = new DivPreloader.DownloadCallback(callback);
        DivPreloader.Ticket ticketPreload = new PreloadVisitor(downloadCallback, callback, this.preloadFilter).preload(div, bindingContext, divStatePath);
        downloadCallback.onFullPreloadStarted();
        return ticketPreload;
    }

    public DivViewDataPreloader(DivImagePreloader divImagePreloader, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController, DivPlayerPreloader divPlayerPreloader, DivPreloader.PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }
}
