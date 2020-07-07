/**********************************************************************************************************************************************************************************
 * Copyright (c) 2020. All rights reserved by Darshan and all his affiliates.                                                                                                     *
 * The program "MainActivity.kt" is a part of the project "Zombie Network Servicer" and is distributed along with the same.                                                       *
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
 * Last Modified - 07/07/20 16:12                                                                                                                                                 *
 **********************************************************************************************************************************************************************************/

/**********************************************************************************************************************************************************************************
 * Copyright (c) 2020. All rights reserved by Darshan and all his affiliates.                                                                                                     *
 * The program "MainActivity.kt" is a part of the project "Zombie Network Servicer" and is distributed along with the same.                                                       *
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
 * Last Modified - 07/07/20 16:11                                                                                                                                                 *
 **********************************************************************************************************************************************************************************/

/****************************************************************************************************************************************************************************************************************
 * Copyright (c) 2020. All rights reserved by Darshan and all his affiliates.                                                                                                                                   *
 * The program "MainActivity.kt" is a part of the project "Zombie Network Servicer" and is distributed along with the same.                                                                                     *
 * This code is provided to you under the terms of the accompanying license.                                                                                                                                    *
 * You may use, distribute or modify the code under these terms by accompanying the original source copy and the copy of the license file.                                                                      *
 * You should have the license file accompanying the original source code.                                                                                                                                      *
 *                                                                                                                                                                                                              *
 * IN NO EVENT SHALL REGENTS BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES,                                                                                        *
 * INCLUDING LOST PROFITS, ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF REGENTS HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.                                                   *
 * REGENTS SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.                                                *
 * THE SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY, PROVIDED HEREUNDER IS PROVIDED "AS IS".                                                                                                                 *
 * REGENTS HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.                                                                                                          *
 *                                                                                                                                                                                                              *
 * Code by Darshan.                                                                                                                                                                                             *
 *                                                                                                                                                                                                              *
 * Last Modified - 07/07/20 16:11                                                                                                                                                                               *
 ****************************************************************************************************************************************************************************************************************/

/**********************************************************************************************************************
 * Copyright (c) 2020. All rights reserved by Darshan and all his affiliates.                                         *
 * The program "MainActivity.kt" is a part of the project "Zombie Network Servicer" and is distributed along with the same.
 * This code is provided to you under the terms of the accompanying license. You may use, distribute or modify the code under these terms by accompanying the original source copy and the copy of the license file.
 * You should have the license file accompanying the original source code.                                            *
 *                                                                                                                    *
 * IN NO EVENT SHALL REGENTS BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES,
 * INCLUDING LOST PROFITS, ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF REGENTS HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * REGENTS SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 * THE SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY, PROVIDED HEREUNDER IS PROVIDED "AS IS".                       *
 * REGENTS HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.                *
 *                                                                                                                    *
 * Code by Darshan.                                                                                                   *
 *                                                                                                                    *
 * Last Modified - 07/07/20 16:07                                                                                     *
 **********************************************************************************************************************/

package techd.cybertech.networktempt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Nothing much here to see >_<
        Handler().postDelayed(
            {
                startActivity(Intent(this,Home::class.java))
                finish()

            },1800)
    }
}
