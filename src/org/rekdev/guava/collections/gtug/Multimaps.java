package org.rekdev.guava.collections.gtug;

import java.math.*;
import java.util.*;

import com.google.common.collect.*;

public class Multimaps {
    class Sale {
        public Sale( Salesperson s, BigDecimal value ) {

        }
    }

    class Salesperson {
        public Salesperson( String name ) {
        }
    }

    public Map<Salesperson,List<Sale>> map = new HashMap<Salesperson,List<Sale>>();

    public void makeSale_map( Salesperson salesPerson, Sale sale ) {
        List<Sale> sales = map.get( salesPerson );
        if ( sales == null ) {
            sales = new ArrayList<Sale>();
            map.put( salesPerson, sales );
        }
        sales.add( sale );
    }
    
    // I love the "type inference" stuff that this .create() brings...
    public Multimap<Salesperson,Sale> multiMap = ArrayListMultimap.create();

    public void makeSale_multiMap( Salesperson salesPerson, Sale sale ) {
        multiMap.put( salesPerson, sale );
    }

}
