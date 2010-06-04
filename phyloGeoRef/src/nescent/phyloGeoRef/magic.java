/*
 *  Copyright (C) 2010 Kathryn Iverson <kd.iverson at gmail.com>
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

package nescent.phyloGeoRef;

import java.io.File;

import nescent.phyloGeoRef.geoData.parseCoords;
import nescent.phyloGeoRef.tree.getTree;

import org.forester.phylogeny.Phylogeny;

/**
 *
 * @author Kathryn Iverson <kd.iverson at gmail.com>
 */
public class magic {

    List coordList;
    //Phylogeny my_phy;

    public void toKML(File treeFile, File coordFile) {
        coordList = parseCoords.parseCSV(coordFile);
       Phylogeny my_phy = getTree.openTree(treeFile);
        

    }

}
