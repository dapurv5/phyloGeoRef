/*
 *  Copyright (C) 2011 apurv
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package nescent.phylogeoref.reader;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.forester.phylogeny.PhylogenyNode;

/**
 * Each labeled phylogeny node has a mould associated with it to contain additional
 * metadata that forester library's implementation cannot accomodate.
 * 
 * @author apurv
 */
public class PhylogenyMould {

    private PhylogenyNode node; //The Node with which this mould is associated.
    private Map<String, String> propertyMap; //The map which will contain all the secondary properties.
    private String clade; //The clade to which this node belongs. Null if no clade divison has been spec.

    private int numObservations;    //The number of observations of this species.
        
    private Vector<Double> latVector;   //Vector for holding  latitude values for multiple occurrences.
    private Vector<Double> lonVector;   //Vector for holding longitude values for multiple occurrences.
    

    public PhylogenyMould(){
        propertyMap = new HashMap<String, String>();
        latVector = new Vector<Double>();
        lonVector = new Vector<Double>();
    }

    public int getNumObservations() {
        return numObservations;
    }    

    public String getClade(){
        return clade;
    }

    /**
     * Returns the names of all the properties stores in this mould.
     * @return
     */
    public Set<String> getAllPropertyNames(){
        return propertyMap.keySet();
    }

    /**
     * Stores a new property, value pair.
     * @param propName
     * @param value
     */
    public void storeValue(String propName, String value){
        propertyMap.put(propName, value);
    }

    /**
     * Accesses the value of a previously stored property.
     * @param propName
     */
    public String accessValue(String propName){
        return propertyMap.get(propName);
    }

    public Vector<Double> getLatVector() {
        return latVector;
    }

    public Vector<Double> getLonVector() {
        return lonVector;
    }
            
    public PhylogenyNode getAssociatedNode() {
        return node;
    }

    public void setAssociatedNode(PhylogenyNode node) {
        this.node = node;
    }

    public void setClade(String cladeName){
        clade = cladeName;
    }
    
    public void setNumObservations(int numObservations) {
        this.numObservations = numObservations;
    }
    
    public void addLatitude(Double latitude){
        latVector.add(latitude);
    }
    
    public void addLongitude(Double longitude){
        lonVector.add(longitude);
    }





}
