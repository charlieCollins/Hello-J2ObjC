//
//  ViewController.swift
//  Hello-J2ObjC-iOS
//
//  Created by Collins, Charles on 7/4/16.
//  Copyright © 2016 Collins, Charles. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    

    
    @IBOutlet weak var label1: UILabel!

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        
        let hello = HelloWorld_getHelloWorld()
        label1.text = hello;
        
        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

