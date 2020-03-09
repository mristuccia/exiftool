/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thebuzzmedia.exiftool;

import java.util.List;

/**
 * Interface used to define different input flags.
 *
 * @author Marco Ristuccia (it-services@marcoristuccia.com)
 * @author Mickael Jeanroy
 * @since 2.5.1
 */
public interface Flag {

	/**
	 * List of arguments to pass to {@code exiftool}.
	 * This method should not return {@code null}, but an empty list if no arguments
	 * should be returned.
	 *
	 * @return List of arguments.
	 */
        String getArg();
    
	//List<String> getArgs();
}
