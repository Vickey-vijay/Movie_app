package com.applovin.mediation;

import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MaxSegmentCollection {

    public interface Builder {
        Builder addSegment(MaxSegment maxSegment);

        MaxSegmentCollection build();
    }

    public abstract List<MaxSegment> getSegments();

    public static Builder builder() {
        return new MaxSegmentCollectionImpl.BuilderImpl();
    }
}
