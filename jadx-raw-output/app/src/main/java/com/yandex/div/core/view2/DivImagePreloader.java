package com.yandex.div.core.view2;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: DivImagePreloader.kt */
/* JADX INFO: loaded from: classes5.dex */
public class DivImagePreloader {
    private final DivImageLoader imageLoader;

    /* JADX INFO: compiled from: DivImagePreloader.kt */
    public final class PreloadVisitor extends DivVisitor<r> {
        private final DivPreloader.DownloadCallback callback;
        private final DivPreloader.PreloadFilter preloadFilter;
        private final ArrayList<LoadReference> references = new ArrayList<>();
        private final ExpressionResolver resolver;
        private final boolean visitContainers;

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

        public PreloadVisitor(DivPreloader.DownloadCallback downloadCallback, ExpressionResolver expressionResolver, DivPreloader.PreloadFilter preloadFilter, boolean z10) {
            this.callback = downloadCallback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
            this.visitContainers = z10;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(Div div, ExpressionResolver expressionResolver) {
            visitBackground(div, expressionResolver);
        }

        public final List<LoadReference> preload(Div div) {
            visit(div, this.resolver);
            return this.references;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.d dVar, ExpressionResolver expressionResolver) {
            visit2(dVar, expressionResolver);
            return r.f64562a;
        }

        private final void visitBackground(Div div, ExpressionResolver expressionResolver) {
            List<DivBackground> background = div.b().getBackground();
            if (background != null) {
                DivImagePreloader divImagePreloader = DivImagePreloader.this;
                for (DivBackground divBackground : background) {
                    if ((divBackground instanceof DivBackground.b) && this.preloadFilter.shouldPreloadBackground(divBackground, expressionResolver)) {
                        divImagePreloader.preloadImage(((DivBackground.b) divBackground).c().f47590e.evaluate(expressionResolver).toString(), this.callback, this.references);
                    }
                }
            }
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.f fVar, ExpressionResolver expressionResolver) {
            visit2(fVar, expressionResolver);
            return r.f64562a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.g gVar, ExpressionResolver expressionResolver) {
            visit2(gVar, expressionResolver);
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
        public /* bridge */ /* synthetic */ r visit(Div.q qVar, ExpressionResolver expressionResolver) {
            visit2(qVar, expressionResolver);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.q qVar, ExpressionResolver expressionResolver) {
            List<DivText.Image> list;
            defaultVisit2((Div) qVar, expressionResolver);
            if (!this.preloadFilter.shouldPreloadContent(qVar, expressionResolver) || (list = qVar.c().F) == null) {
                return;
            }
            DivImagePreloader divImagePreloader = DivImagePreloader.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                divImagePreloader.preloadImage(((DivText.Image) it.next()).f49528i.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.g gVar, ExpressionResolver expressionResolver) {
            defaultVisit2((Div) gVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(gVar, expressionResolver)) {
                DivImagePreloader.this.preloadImage(gVar.c().B.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.e eVar, ExpressionResolver expressionResolver) {
            defaultVisit2((Div) eVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(eVar, expressionResolver)) {
                DivImagePreloader.this.preloadImageBytes(eVar.c().f47382u.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.b bVar, ExpressionResolver expressionResolver) {
            defaultVisit2((Div) bVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(bVar.c(), expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.f fVar, ExpressionResolver expressionResolver) {
            defaultVisit2((Div) fVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(fVar.c()).iterator();
                while (it.hasNext()) {
                    visit((Div) it.next(), expressionResolver);
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.d dVar, ExpressionResolver expressionResolver) {
            defaultVisit2((Div) dVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(dVar.c(), expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.j jVar, ExpressionResolver expressionResolver) {
            defaultVisit2((Div) jVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(jVar.c(), expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.p pVar, ExpressionResolver expressionResolver) {
            defaultVisit2((Div) pVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = pVar.c().f49264q.iterator();
                while (it.hasNext()) {
                    visit(((DivTabs.Item) it.next()).f49276a, expressionResolver);
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(Div.n nVar, ExpressionResolver expressionResolver) {
            defaultVisit2((Div) nVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = nVar.c().I.iterator();
                while (it.hasNext()) {
                    Div div = ((DivState.State) it.next()).f49049c;
                    if (div != null) {
                        visit(div, expressionResolver);
                    }
                }
            }
        }
    }

    public List<LoadReference> preloadImage(Div div, ExpressionResolver expressionResolver, DivPreloader.PreloadFilter preloadFilter, DivPreloader.DownloadCallback downloadCallback) {
        return new PreloadVisitor(downloadCallback, expressionResolver, preloadFilter, false).preload(div);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImage(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImage(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImageBytes(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImageBytes(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }

    public DivImagePreloader(DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }
}
