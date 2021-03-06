/**********************************************************************************************************************************************************************************
 * Copyright (c) 2020. All rights reserved by Darshan and all his affiliates.                                                                                                     *
 * The program "URLhandler.kt" is a part of the project "Zombie Network Servicer" and is distributed along with the same.                                                         *
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
 *
 * @author Darshan
 *
 */
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class URLhandler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var msg:String="Nothing";
        val it = intent
        if (it.action.equals(Intent.ACTION_VIEW)){
            val uri:Uri = it.data!!
            msg="Received Scheme as ${uri.scheme}, Host as ${uri.host}, with path as ${uri.path}"
        }
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()

    }
}
