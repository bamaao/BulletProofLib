package edu.stanford.cs.crypto.efficientct.circuit;

import cyclops.collections.immutable.VectorX;
import edu.stanford.cs.crypto.efficientct.commitments.PeddersenCommitment;
import edu.stanford.cs.crypto.efficientct.linearalgebra.FieldVector;

import java.math.BigInteger;

/**
 * Created by buenz on 7/6/17.
 */
public class CircuitWitness {
    private final FieldVector l;
    private final FieldVector r;
    private final FieldVector o;
    private final VectorX<PeddersenCommitment> commitments;

    public CircuitWitness(FieldVector l, FieldVector r, FieldVector o, VectorX<PeddersenCommitment> commitments) {
        this.l = l;
        this.r = r;
        this.o = o;
        this.commitments = commitments;
    }


    public FieldVector getL() {
        return l;
    }

    public FieldVector getR() {
        return r;
    }

    public FieldVector getO() {
        return o;
    }

    public VectorX<PeddersenCommitment> getCommitments() {
        return commitments;
    }
}
