/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class ACmpgBinop extends PBinop
{
    private TCmpg _cmpg_;

    public ACmpgBinop()
    {
        // Constructor
    }

    public ACmpgBinop(
        @SuppressWarnings("hiding") TCmpg _cmpg_)
    {
        // Constructor
        setCmpg(_cmpg_);

    }

    @Override
    public Object clone()
    {
        return new ACmpgBinop(
            cloneNode(this._cmpg_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmpgBinop(this);
    }

    public TCmpg getCmpg()
    {
        return this._cmpg_;
    }

    public void setCmpg(TCmpg node)
    {
        if(this._cmpg_ != null)
        {
            this._cmpg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmpg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cmpg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cmpg_ == child)
        {
            this._cmpg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cmpg_ == oldChild)
        {
            setCmpg((TCmpg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}