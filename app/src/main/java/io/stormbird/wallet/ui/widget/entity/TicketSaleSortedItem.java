package io.stormbird.wallet.ui.widget.entity;

import io.stormbird.wallet.ui.widget.holder.TicketHolder;
import io.stormbird.wallet.ui.widget.holder.TicketSaleHolder;
import io.stormbird.token.entity.TicketRange;

/**
 * Created by James on 12/02/2018.
 */

public class TicketSaleSortedItem extends SortedItem<TicketRange>
{
    public TicketSaleSortedItem(TicketRange range, int weight) {
        super(TicketSaleHolder.VIEW_TYPE, range, weight);
    }

    @Override
    public int compare(SortedItem other)
    {
        return weight - other.weight;
    }

    @Override
    public boolean areContentsTheSame(SortedItem newItem)
    {
        return false;
    }

    @Override
    public boolean areItemsTheSame(SortedItem other)
    {
        return other.viewType == TicketHolder.VIEW_TYPE
                && ( ((TicketSaleSortedItem) other).value.tokenIds.size() == value.tokenIds.size()
                && ((TicketSaleSortedItem) other).value.tokenIds.get(0) == value.tokenIds.get(0));
    }
}