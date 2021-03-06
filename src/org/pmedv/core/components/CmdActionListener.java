/**

	BlackBoard BreadBoard Designer
	Written and maintained by Matthias Pueski 
	
	Copyright (c) 2010-2011 Matthias Pueski
	
	This program is free software; you can redistribute it and/or
	modify it under the terms of the GNU General Public License
	as published by the Free Software Foundation; either version 2
	of the License, or (at your option) any later version.
	
	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.
	
	You should have received a copy of the GNU General Public License
	along with this program; if not, write to the Free Software
	Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

 */
package org.pmedv.core.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.pmedv.core.commands.CommandHolder;

/**
 * @author mpue
 * 
 */
public class CmdActionListener implements ActionListener {

	private static final Log log = LogFactory.getLog(CmdActionListener.class);

	public void actionPerformed(ActionEvent e) {

		CommandHolder obj = (CommandHolder) e.getSource();
		
		if (obj.getCommand() != null) {
			try {
				obj.getCommand().execute(null);
			}
			catch (Exception e1) {
				log.info("An exception occured during command execution : \n" + e1.getClass());	
				e1.printStackTrace();
			}
		}
	}

}
