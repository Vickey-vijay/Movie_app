package com.yandex.div.core.view2.items;

import android.net.Uri;
import ck.p;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: compiled from: DivItemChangeActionHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivItemChangeActionHandler {
    public static final DivItemChangeActionHandler INSTANCE = new DivItemChangeActionHandler();

    private DivItemChangeActionHandler() {
    }

    public static /* synthetic */ int getStepParam$default(DivItemChangeActionHandler divItemChangeActionHandler, Uri uri, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return divItemChangeActionHandler.getStepParam(uri, i10);
    }

    private final boolean handleNextItem(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    private final boolean handlePreviousItem(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    private final boolean handleScrollBackward(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollByOffset(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    private final boolean handleScrollForward(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollByOffset(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    private final boolean handleScrollTo(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollTo(getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0052 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean canHandle(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1789088446:
                    if (str.equals("set_next_item")) {
                        return true;
                    }
                    break;
                case -1509135083:
                    if (str.equals("scroll_backward")) {
                        return true;
                    }
                    break;
                case -1348467885:
                    if (str.equals("scroll_forward")) {
                        return true;
                    }
                    break;
                case -1280379330:
                    if (str.equals("set_previous_item")) {
                        return true;
                    }
                    break;
                case -770388272:
                    if (str.equals("scroll_to_start")) {
                        return true;
                    }
                    break;
                case -88123690:
                    if (str.equals("set_current_item")) {
                        return true;
                    }
                    break;
                case 633820873:
                    if (str.equals("scroll_to_end")) {
                        return true;
                    }
                    break;
                case 1099321339:
                    if (str.equals("scroll_to_position")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    private final Direction direction(String str) {
        if (p.e(str, "set_previous_item")) {
            return Direction.PREVIOUS;
        }
        return p.e(str, "set_next_item") ? Direction.NEXT : Direction.NEXT;
    }

    private final int getStepParam(Uri uri, int i10) {
        String queryParameter = uri.getQueryParameter("step");
        if (queryParameter == null) {
            return i10;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            KAssert kAssert = KAssert.INSTANCE;
            if (!Assert.isEnabled()) {
                return i10;
            }
            Assert.fail(queryParameter + " is not a number");
            return i10;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean handleAction(Uri uri, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("id param is required to set item");
            }
            return false;
        }
        String authority = uri.getAuthority();
        DivViewWithItemsController.Companion companion = DivViewWithItemsController.Companion;
        DivItemChangeActionHandler divItemChangeActionHandler = INSTANCE;
        DivViewWithItemsController divViewWithItemsControllerCreate = companion.create(queryParameter, divViewFacade, expressionResolver, divItemChangeActionHandler.direction(authority));
        if (divViewWithItemsControllerCreate == null) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("animated");
        boolean z10 = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : true;
        if (authority == null) {
            return false;
        }
        switch (authority.hashCode()) {
            case -1789088446:
                if (authority.equals("set_next_item")) {
                    return divItemChangeActionHandler.handleNextItem(uri, z10, divViewWithItemsControllerCreate);
                }
                return false;
            case -1509135083:
                if (authority.equals("scroll_backward")) {
                    return divItemChangeActionHandler.handleScrollBackward(uri, z10, divViewWithItemsControllerCreate);
                }
                return false;
            case -1348467885:
                if (authority.equals("scroll_forward")) {
                    return divItemChangeActionHandler.handleScrollForward(uri, z10, divViewWithItemsControllerCreate);
                }
                return false;
            case -1280379330:
                if (authority.equals("set_previous_item")) {
                    return divItemChangeActionHandler.handlePreviousItem(uri, z10, divViewWithItemsControllerCreate);
                }
                return false;
            case -770388272:
                if (authority.equals("scroll_to_start")) {
                    return divItemChangeActionHandler.handleScrollToTheStart(z10, divViewWithItemsControllerCreate);
                }
                return false;
            case -88123690:
                if (authority.equals("set_current_item")) {
                    return divItemChangeActionHandler.handleSetCurrentItem(uri, z10, divViewWithItemsControllerCreate);
                }
                return false;
            case 633820873:
                if (authority.equals("scroll_to_end")) {
                    return divItemChangeActionHandler.handleScrollToTheEnd(z10, divViewWithItemsControllerCreate);
                }
                return false;
            case 1099321339:
                if (authority.equals("scroll_to_position")) {
                    return divItemChangeActionHandler.handleScrollTo(uri, z10, divViewWithItemsControllerCreate);
                }
                return false;
            default:
                return false;
        }
    }

    private final boolean handleSetCurrentItem(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        String queryParameter = uri.getQueryParameter("item");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("item is required to set current item");
            }
            return false;
        }
        try {
            divViewWithItemsController.setCurrentItem(Integer.parseInt(queryParameter), z10);
            return true;
        } catch (NumberFormatException unused) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(queryParameter + " is not a number");
            }
            return false;
        }
    }

    private final boolean handleScrollToTheEnd(boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollToEnd(z10);
        return true;
    }

    private final boolean handleScrollToTheStart(boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollToStart(z10);
        return true;
    }
}
