package com.yandex.div.internal.core;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: DivVisitor.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivVisitor<T> {
    public abstract T defaultVisit(Div div, ExpressionResolver expressionResolver);

    public final T visit(Div div, ExpressionResolver expressionResolver) {
        if (div instanceof Div.q) {
            return visit((Div.q) div, expressionResolver);
        }
        if (div instanceof Div.g) {
            return visit((Div.g) div, expressionResolver);
        }
        if (div instanceof Div.e) {
            return visit((Div.e) div, expressionResolver);
        }
        if (div instanceof Div.l) {
            return visit((Div.l) div, expressionResolver);
        }
        if (div instanceof Div.b) {
            return visit((Div.b) div, expressionResolver);
        }
        if (div instanceof Div.f) {
            return visit((Div.f) div, expressionResolver);
        }
        if (div instanceof Div.d) {
            return visit((Div.d) div, expressionResolver);
        }
        if (div instanceof Div.j) {
            return visit((Div.j) div, expressionResolver);
        }
        if (div instanceof Div.p) {
            return visit((Div.p) div, expressionResolver);
        }
        if (div instanceof Div.n) {
            return visit((Div.n) div, expressionResolver);
        }
        if (div instanceof Div.c) {
            return visit((Div.c) div, expressionResolver);
        }
        if (div instanceof Div.h) {
            return visit((Div.h) div, expressionResolver);
        }
        if (div instanceof Div.m) {
            return visit((Div.m) div, expressionResolver);
        }
        if (div instanceof Div.i) {
            return visit((Div.i) div, expressionResolver);
        }
        if (div instanceof Div.k) {
            return visit((Div.k) div, expressionResolver);
        }
        if (div instanceof Div.r) {
            return visit((Div.r) div, expressionResolver);
        }
        if (div instanceof Div.o) {
            return visit((Div.o) div, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public T visit(Div.q qVar, ExpressionResolver expressionResolver) {
        return defaultVisit(qVar, expressionResolver);
    }

    public T visit(Div.g gVar, ExpressionResolver expressionResolver) {
        return defaultVisit(gVar, expressionResolver);
    }

    public T visit(Div.e eVar, ExpressionResolver expressionResolver) {
        return defaultVisit(eVar, expressionResolver);
    }

    public T visit(Div.l lVar, ExpressionResolver expressionResolver) {
        return defaultVisit(lVar, expressionResolver);
    }

    public T visit(Div.b bVar, ExpressionResolver expressionResolver) {
        return defaultVisit(bVar, expressionResolver);
    }

    public T visit(Div.f fVar, ExpressionResolver expressionResolver) {
        return defaultVisit(fVar, expressionResolver);
    }

    public T visit(Div.d dVar, ExpressionResolver expressionResolver) {
        return defaultVisit(dVar, expressionResolver);
    }

    public T visit(Div.j jVar, ExpressionResolver expressionResolver) {
        return defaultVisit(jVar, expressionResolver);
    }

    public T visit(Div.p pVar, ExpressionResolver expressionResolver) {
        return defaultVisit(pVar, expressionResolver);
    }

    public T visit(Div.n nVar, ExpressionResolver expressionResolver) {
        return defaultVisit(nVar, expressionResolver);
    }

    public T visit(Div.c cVar, ExpressionResolver expressionResolver) {
        return defaultVisit(cVar, expressionResolver);
    }

    public T visit(Div.h hVar, ExpressionResolver expressionResolver) {
        return defaultVisit(hVar, expressionResolver);
    }

    public T visit(Div.m mVar, ExpressionResolver expressionResolver) {
        return defaultVisit(mVar, expressionResolver);
    }

    public T visit(Div.i iVar, ExpressionResolver expressionResolver) {
        return defaultVisit(iVar, expressionResolver);
    }

    public T visit(Div.k kVar, ExpressionResolver expressionResolver) {
        return defaultVisit(kVar, expressionResolver);
    }

    public T visit(Div.r rVar, ExpressionResolver expressionResolver) {
        return defaultVisit(rVar, expressionResolver);
    }

    public T visit(Div.o oVar, ExpressionResolver expressionResolver) {
        return defaultVisit(oVar, expressionResolver);
    }
}
