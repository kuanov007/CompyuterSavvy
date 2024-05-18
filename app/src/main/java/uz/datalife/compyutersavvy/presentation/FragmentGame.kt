package uz.datalife.compyutersavvy.presentation


import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import uz.datalife.compyutersavvy.R
import uz.datalife.compyutersavvy.data.Constants
import uz.datalife.compyutersavvy.data.Question
import uz.datalife.compyutersavvy.databinding.FragmentGameBinding

class FragmentGame : Fragment(R.layout.fragment_game) {
    private lateinit var questions: List<Question>
    private lateinit var binding: FragmentGameBinding
    private var currentQuestionId = -1
    private var selectedAnswerId = -1
    private var correctAnswers = 0
    private val navArguments: FragmentGameArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGameBinding.bind(view)
        val id = navArguments.clazz

        questions = Constants.privedeQuestions().filter { it.class_id == id }

        currentQuestionId = 0
        setQuestion()

        binding.apply {

            btn1.setOnClickListener {
                optionSelected(btn1)
                selectedAnswerId = 0
            }

            btn2.setOnClickListener {
                optionSelected(btn2)
                selectedAnswerId = 1
            }

            btn3.setOnClickListener {
                optionSelected(btn3)
                selectedAnswerId = 2
            }

            btn4.setOnClickListener {
                optionSelected(btn4)
                selectedAnswerId = 3
            }
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }

            btnNext.setOnClickListener {
                when (btnNext.text) {
                    getString(R.string.submit) -> checkAnswer()
                    getString(R.string.finish_text) -> {
                        val action = FragmentGameDirections.actionFragmentGameToFragmentResult(
                            correctAnswers,
                            questions.size
                        )
                        findNavController().navigate(action)
                    }

                    getString(R.string.continue_text) -> {
                        currentQuestionId++
                        setQuestion()
                    }
                    // added comment
                }
            }
        }
    }

    private fun setQuestion() {
        val currentQuestion = questions[currentQuestionId]

        binding.apply {
            countQuestion.text =
                getString(R.string.question_counter, currentQuestionId + 1, questions.size)
            questionText.text = currentQuestion.question
            currentQuestion.option = currentQuestion.option.shuffled()
            optionText1.text = currentQuestion.option[0]
            optionText2.text = currentQuestion.option[1]
            optionText3.text = currentQuestion.option[2]
            optionText4.visibility = View.GONE


            if (currentQuestion.option.size > 3) {
                optionText4.visibility = View.VISIBLE
                optionText4.text = currentQuestion.option[3]
            }
            btn1.isEnabled = true
            btn2.isEnabled = true
            btn3.isEnabled = true
            btn4.isEnabled = true

            btn1.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.tranparent_color)
            )
            btn2.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.tranparent_color)
            )
            btn3.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.tranparent_color)
            )
            btn4.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.tranparent_color)
            )

            btnNext.text = getString(R.string.submit)
        }


    }

    private fun optionSelected(linearLayout: LinearLayout) {
        binding.apply {
            btn1.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.tranparent_color)
            )
            btn2.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.tranparent_color)
            )
            btn3.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.tranparent_color)
            )
            btn4.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.tranparent_color)
            )
        }

        linearLayout.backgroundTintList = ColorStateList.valueOf(
            ContextCompat.getColor(requireContext(), R.color.selected_color)
        )
    }

    private fun checkAnswer() {

        val currentQuestion = questions[currentQuestionId]

        if (selectedAnswerId == -1) {
            Snackbar.make(
                binding.btnNext,
                "Please, select option",
                Snackbar.LENGTH_SHORT
            ).show()
            return
        }

        binding.apply {

            when (selectedAnswerId) {
                0 -> {
                    btn1.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(requireContext(), R.color.wrong_color)
                    )
                }

                1 -> {
                    btn2.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(requireContext(), R.color.wrong_color)
                    )
                }

                2 -> {
                    btn3.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(requireContext(), R.color.wrong_color)
                    )
                }

                3 -> {
                    btn4.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(requireContext(), R.color.wrong_color)
                    )
                }
            }

            when (questions[currentQuestionId].option.indexOf(questions[currentQuestionId].correctAnswer)) {
                0 -> {
                    btn1.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(requireContext(), R.color.correct_color)
                    )
                }

                1 -> {
                    btn2.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(requireContext(), R.color.correct_color)
                    )
                }

                2 -> {
                    btn3.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(requireContext(), R.color.correct_color)
                    )
                }

                3 -> {
                    btn4.backgroundTintList = ColorStateList.valueOf(
                        ContextCompat.getColor(requireContext(), R.color.correct_color)
                    )
                }

                else -> {}
            }

            if (currentQuestionId != questions.lastIndex) {
                btnNext.text = getString(R.string.continue_text)
            } else {
                btnNext.text = getString(R.string.finish_text)
            }

            btn1.isEnabled = false
            btn2.isEnabled = false
            btn3.isEnabled = false
            btn4.isEnabled = false

            selectedAnswerId = -1
        }
    }
}