package akbar2.abun.Latihan_bab1

import akbar2.abun.bab1.R
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class fragmen_gitbuh : Fragment() {

    companion object {
        fun newInstance() = fragmen_gitbuh()
    }

    private lateinit var viewModel: FragmenGitbuhViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.akbarabun_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmenGitbuhViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
