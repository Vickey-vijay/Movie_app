package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class MenuKt {

    /* JADX INFO: renamed from: androidx.core.view.MenuKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Menu.kt */
    public static final class AnonymousClass1 implements Iterator<MenuItem>, dk.a {
        public final /* synthetic */ Menu $this_iterator;
        private int index;

        public AnonymousClass1(Menu menu) {
            this.$this_iterator = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MenuItem next() {
            Menu menu = this.$this_iterator;
            int i10 = this.index;
            this.index = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            mj.r rVar;
            Menu menu = this.$this_iterator;
            int i10 = this.index - 1;
            this.index = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                menu.removeItem(item.getItemId());
                rVar = mj.r.f64562a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final kk.i<MenuItem> getChildren(final Menu menu) {
        return new kk.i<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // kk.i
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        return new AnonymousClass1(menu);
    }

    public static final boolean contains(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ck.p.e(menu.getItem(i10), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, bk.l<? super MenuItem, mj.r> lVar) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(menu.getItem(i10));
        }
    }

    public static final void forEachIndexed(Menu menu, bk.p<? super Integer, ? super MenuItem, mj.r> pVar) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.mo1invoke(Integer.valueOf(i10), menu.getItem(i10));
        }
    }

    public static final MenuItem get(Menu menu, int i10) {
        return menu.getItem(i10);
    }

    public static final int getSize(Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        if (menu.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(Menu menu) {
        if (menu.size() != 0) {
            return true;
        }
        return false;
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i10) {
        mj.r rVar;
        MenuItem item = menu.getItem(i10);
        if (item != null) {
            menu.removeItem(item.getItemId());
            rVar = mj.r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar != null) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
