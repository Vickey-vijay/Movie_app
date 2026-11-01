package com.yandex.div.core.view2.divs.pager;

import com.yandex.div2.DivPager;

/* JADX INFO: compiled from: DivPagerPageOffsetProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPagerPageOffsetProvider {
    private final DivPagerAdapter adapter;
    private final DivPager.ItemAlignment alignment;
    private final boolean infiniteScroll;
    private final float itemSpacing;
    private final DivPagerPaddingsHolder paddings;
    private final DivPagerPageSizeProvider pageSizeProvider;
    private final int parentSize;

    private final float getInitialOffset(float f10, int i10, boolean z10) {
        if (z10) {
            return 0.0f;
        }
        double d10 = f10;
        int iCeil = i10 - ((int) Math.ceil(d10));
        int iFloor = i10 - ((int) Math.floor(d10));
        if (contentIsSmallerThanPager(iCeil, iFloor)) {
            return getOffsetForSmallContent(f10, iCeil, iFloor);
        }
        if (this.infiniteScroll) {
            return 0.0f;
        }
        float startOffset = getStartOffset(f10, iCeil, iFloor);
        if (!(startOffset == 0.0f)) {
            return startOffset;
        }
        float endOffset = getEndOffset(f10, iCeil, iFloor);
        if (endOffset == 0.0f) {
            return 0.0f;
        }
        return endOffset;
    }

    private final float getOffset(float f10, int i10) {
        int i11 = 1;
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int iSignum = (int) Math.signum(f10);
        int iAbs = (int) Math.abs(f10);
        float onePositionOffset = 0.0f;
        if (1 <= iAbs) {
            while (true) {
                onePositionOffset += getOnePositionOffset(i10, iSignum);
                i10 -= iSignum;
                if (i11 == iAbs) {
                    break;
                }
                i11++;
            }
        }
        float frac = getFrac(f10);
        return onePositionOffset + (frac > 0.0f ? frac * getOnePositionOffset(i10, iSignum) : 0.0f);
    }

    private final float getOffsetForSmallContent(float f10, int i10, int i11) {
        float frac = f10 <= 0.0f ? getFrac(f10) : getFracInverted(f10);
        Float itemSize = this.pageSizeProvider.getItemSize(i10);
        if (itemSize == null) {
            return 0.0f;
        }
        float fFloatValue = itemSize.floatValue() * frac;
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            Float itemSize2 = this.pageSizeProvider.getItemSize(i12);
            if (itemSize2 == null) {
                return 0.0f;
            }
            fFloatValue += itemSize2.floatValue() + this.itemSpacing;
        }
        return fFloatValue - getInitialStartOffset(i10, i11, frac);
    }

    private final boolean contentIsSmallerThanPager(int i10, int i11) {
        float start = (this.parentSize - this.paddings.getStart()) - this.paddings.getEnd();
        Float itemSize = this.pageSizeProvider.getItemSize(i10);
        if (itemSize != null) {
            float fFloatValue = itemSize.floatValue();
            if (fFloatValue >= start) {
                return false;
            }
            if (i10 != i11) {
                float f10 = this.itemSpacing;
                Float itemSize2 = this.pageSizeProvider.getItemSize(i11);
                if (itemSize2 == null) {
                    return true;
                }
                fFloatValue += f10 + itemSize2.floatValue();
                if (fFloatValue >= start) {
                    return false;
                }
            }
            for (int i12 = i10 - 1; -1 < i12; i12--) {
                float f11 = this.itemSpacing;
                Float itemSize3 = this.pageSizeProvider.getItemSize(i12);
                if (itemSize3 == null) {
                    break;
                }
                fFloatValue += f11 + itemSize3.floatValue();
                if (fFloatValue >= start) {
                    return false;
                }
            }
            int itemCount = this.adapter.getItemCount();
            for (int i13 = i11 + 1; i13 < itemCount; i13++) {
                float f12 = this.itemSpacing;
                Float itemSize4 = this.pageSizeProvider.getItemSize(i13);
                if (itemSize4 == null) {
                    break;
                }
                fFloatValue += f12 + itemSize4.floatValue();
                if (fFloatValue >= start) {
                    return false;
                }
            }
        }
        return true;
    }

    private final float getEndOffset(float f10, int i10, int i11) {
        Float nextNeighbourSize;
        Float itemSize;
        if (this.alignment != DivPager.ItemAlignment.END && (nextNeighbourSize = this.pageSizeProvider.getNextNeighbourSize(i10)) != null) {
            float fFloatValue = nextNeighbourSize.floatValue();
            Float nextNeighbourSize2 = this.pageSizeProvider.getNextNeighbourSize(i11);
            if (nextNeighbourSize2 != null) {
                float fFloatValue2 = nextNeighbourSize2.floatValue();
                float frac = f10 > 0.0f ? getFrac(f10) : getFracInverted(f10);
                float end = ((fFloatValue * frac) + (fFloatValue2 * (1 - frac))) - this.paddings.getEnd();
                if (!(end == 0.0f) && (itemSize = this.pageSizeProvider.getItemSize(i11)) != null) {
                    float fFloatValue3 = itemSize.floatValue() * frac;
                    if (biggerThan(fFloatValue3, end)) {
                        return 0.0f;
                    }
                    int itemCount = this.adapter.getItemCount();
                    for (int i12 = i11 + 1; i12 < itemCount; i12++) {
                        Float itemSize2 = this.pageSizeProvider.getItemSize(i12);
                        if (itemSize2 == null) {
                            return 0.0f;
                        }
                        fFloatValue3 += itemSize2.floatValue() + this.itemSpacing;
                        if (biggerThan(fFloatValue3, end)) {
                            return 0.0f;
                        }
                    }
                    return end - fFloatValue3;
                }
            }
        }
        return 0.0f;
    }

    private final float getInitialStartOffset(int i10, int i11, float f10) {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(i10);
        if (prevNeighbourSize != null) {
            float fFloatValue = prevNeighbourSize.floatValue();
            Float prevNeighbourSize2 = this.pageSizeProvider.getPrevNeighbourSize(i11);
            if (prevNeighbourSize2 != null) {
                return ((fFloatValue * (1 - f10)) + (prevNeighbourSize2.floatValue() * f10)) - this.paddings.getStart();
            }
        }
        return 0.0f;
    }

    private final float getOnePositionOffset(int i10, int i11) {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(i11 > 0 ? i10 : i10 + 1);
        if (prevNeighbourSize != null) {
            float fFloatValue = prevNeighbourSize.floatValue();
            DivPagerPageSizeProvider divPagerPageSizeProvider = this.pageSizeProvider;
            if (i11 > 0) {
                i10--;
            }
            Float nextNeighbourSize = divPagerPageSizeProvider.getNextNeighbourSize(i10);
            if (nextNeighbourSize != null) {
                return ((fFloatValue + nextNeighbourSize.floatValue()) - this.itemSpacing) * i11;
            }
        }
        return 0.0f;
    }

    private final float getStartOffset(float f10, int i10, int i11) {
        Float itemSize;
        if (this.alignment == DivPager.ItemAlignment.START) {
            return 0.0f;
        }
        float frac = f10 <= 0.0f ? getFrac(f10) : getFracInverted(f10);
        float initialStartOffset = getInitialStartOffset(i10, i11, frac);
        if ((initialStartOffset == 0.0f) || (itemSize = this.pageSizeProvider.getItemSize(i10)) == null) {
            return 0.0f;
        }
        float fFloatValue = itemSize.floatValue() * frac;
        if (biggerThan(fFloatValue, initialStartOffset)) {
            return 0.0f;
        }
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            Float itemSize2 = this.pageSizeProvider.getItemSize(i12);
            if (itemSize2 == null) {
                return 0.0f;
            }
            fFloatValue += itemSize2.floatValue() + this.itemSpacing;
            if (biggerThan(fFloatValue, initialStartOffset)) {
                return 0.0f;
            }
        }
        return fFloatValue - initialStartOffset;
    }

    public DivPagerPageOffsetProvider(int i10, float f10, DivPagerPageSizeProvider divPagerPageSizeProvider, DivPagerPaddingsHolder divPagerPaddingsHolder, boolean z10, DivPagerAdapter divPagerAdapter, DivPager.ItemAlignment itemAlignment) {
        this.parentSize = i10;
        this.itemSpacing = f10;
        this.pageSizeProvider = divPagerPageSizeProvider;
        this.paddings = divPagerPaddingsHolder;
        this.infiniteScroll = z10;
        this.adapter = divPagerAdapter;
        this.alignment = itemAlignment;
    }

    private final boolean biggerThan(float f10, float f11) {
        if (f10 >= Math.abs(f11)) {
            return true;
        }
        return false;
    }

    private final float getFrac(float f10) {
        float fAbs = Math.abs(f10);
        return fAbs - ((float) Math.floor(fAbs));
    }

    private final float getFracInverted(float f10) {
        float frac = getFrac(f10);
        if (frac <= 0.0f) {
            return 0.0f;
        }
        return 1 - frac;
    }

    public final float getPageOffset(float f10, int i10, boolean z10) {
        return getOffset(f10, i10) - getInitialOffset(f10, i10, z10);
    }
}
