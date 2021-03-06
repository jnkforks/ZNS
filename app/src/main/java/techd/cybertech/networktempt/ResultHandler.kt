/**********************************************************************************************************************************************************************************
 * Copyright (c) 2020. All rights reserved by Darshan and all his affiliates.                                                                                                     *
 * The program "ResultHandler.kt" is a part of the project "Zombie Network Servicer" and is distributed along with the same.                                                      *
 * This code is provided to you under the terms of the accompanying license.                                                                                                      *
 * You may use, distribute or modify the code under these terms by accompanying the original source copy and the copy of the license file.                                        *
 * You should have the license file accompanying the original source code.                                                                                                        *
 *                                                                                                                                                                                *
 * IN NO EVENT SHALL REGENTS BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES,                                                          *
 * INCLUDING LOST PROFITS, ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF REGENTS HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.                     *
 * REGENTS SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.                  *
 * THE SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY, PROVIDED HEREUNDER IS PROVIDED "AS IS".                                                                                   *
 * REGENTS HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.                                                                            *
 *                                                                                                                                                                                *
 * Code by Darshan.                                                                                                                                                               *
 *                                                                                                                                                                                *
 * Last Modified - 07/07/20 16:13                                                                                                                                                 *
 **********************************************************************************************************************************************************************************/


package techd.cybertech.networktempt

/**
 * Interface to handle the results of the process. This is implemented by the Home class to listen to the changes of the process
 */
interface ResultHandler {
    fun update(result:String){

    }
}