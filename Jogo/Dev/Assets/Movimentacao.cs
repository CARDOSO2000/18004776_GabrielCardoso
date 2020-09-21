using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Movimentacao : MonoBehaviour{
    public Animator animator;
// Start is called before the first frame update
void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown("a"))
        {
            animator.SetFloat("Speed", 1);
            GetComponent<Rigidbody>().velocity = new Vector3(-2, 0, 0);
            StartCoroutine(stopMoving());
           
            //Debug.Log("it works");

        }
        if (Input.GetKeyDown("d"))
        {
            animator.SetFloat("Speed", -1);
            GetComponent<Rigidbody>().velocity = new Vector3(2, 0, 0);
            StartCoroutine(stopMoving());
            
            //Debug.Log("it works");

        }
    }
    IEnumerator stopMoving()
    {
        yield return new WaitForSeconds(1);
        GetComponent<Animator>().speed = 0;
        animator.SetFloat("Speed", 0);
    }
}
